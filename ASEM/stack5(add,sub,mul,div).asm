%include "io.inc"

extern _printf
extern _scanf

section .data
    argv    db  '%d', 10, 00
    argv1   db  '%d %d', 10, 00
    argv2   db  '%d %d', 10, 00
    argv3   db  'q:%d, r:%d', 10, 00

section .bss
    num1    resd    1   ; num1과 num2는 주소값
    num2    resd    1
    res     resd    1

section .text
global CMAIN
CMAIN:
    mov ebp, esp; for correct debugging
    push ebp        ; 스택의 시작
    mov ebp, esp
    
    ; data input
    push num2
    push num1
    push argv1
    call _scanf     ; C언어 표현 ; scanf('%d %d', &num1, &num2)
    add esp, 12     ; 어셈블리에서는 num1, num2를 인자로 push하면 된다.
    
    ; 입력된 데이터 출력
    push dword [num2]
    push dword [num1]
    push argv2
    call _printf
    add esp, 12
    
    ; add
    mov eax, 0
    mov edx, 0
    mov eax, dword[num1]
    mov edx, dword[num2]
    add eax, edx
    push eax
    push argv
    call _printf
    add esp, 8
    
    ; sub
    mov eax, 0
    mov edx, 0
    mov eax, dword[num1]
    mov dword[res], eax
    mov edx, dword[num2]
    sub dword[res], edx
    
    push dword[res]
    push argv
    call _printf
    add esp, 8
    
    ;mul
    mov eax, 0
    mov edx, 0
    mov eax, dword[num1]
    mov edx, dword[num2]
    mul edx
    push eax
    push argv
    call _printf
    add esp, 8
    
    ;div
    mov eax, 0
    mov edx, 0
    mov ax, word[num1]
    mov bx, word[num2]
    cwd                 ; word -> dword
    div bx
    push edx
    push eax
    push argv3
    call _printf        ; printf('q:%d, r:%d\n', 몫, 나머지)
    add esp, 12
    
    pop ebp
    xor eax, eax
    ret
