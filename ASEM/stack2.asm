%include "io.inc"

extern printf

section .data
    a dd 5
    fmt db 'a = %d, eax = %d', 10, 0 ; 10은 \n

section .text
global CMAIN
CMAIN:
    push ebp
    mov ebp, esp
    
    mov eax, [a]
    add eax, 2
    push eax
    push dword [a]
    push dword fmt
    call printf
    add esp, 12
    
    pop ebp
    xor eax, eax
    ret
