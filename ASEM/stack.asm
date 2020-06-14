%include "io.inc"

; 32비트 모드에서 사용
; 1부터 10까지 출력하는 코드
; 스택사용

extern printf

section .data
    prompt_int db ' %d', 10, 0

section .text
global CMAIN
CMAIN:
    mov ebp, esp; for correct debugging
    push ebp    ; 함수의 시작, CMAIN이 끝나고 돌아갈 곳의 주소를 스택에 저장, 
                ; esp가 0x61ff0C가 저장되어있다가~
    mov ebp, esp    ; 4byte 이동하여 0x61ff08가 됐음
    mov ebx, 1
    
for:    
    cmp ebx, 10
    jg end  ; ebx가 10보다 크면 end로 이동
    
    push ebx
    push prompt_int ; 4byte이동하여 0x61ff04가 됨
    call printf
    add esp, 8  ; 앞에 push가 2개 있기 때문에 8(byte)를 더해주었음
    inc ebx ; 10번을 반복하기 위해 변수를 더해줬다고 생각하면 됨
    jmp for
    
end:   
    pop ebp 
    xor eax, eax
    ret
