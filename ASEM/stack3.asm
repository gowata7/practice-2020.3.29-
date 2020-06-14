%include "io.inc"
extern printf   ;32bit mode

section .data
    msg1 db 'hello', 10, 0
    msg2 db 'para : <%d>', 0
    my dd 45, 1, 2, 3
    
section .text
global CMAIN
CMAIN:
    push ebp
    mov ebp, esp
    
    push msg1
    call printf
    add esp, 4
    
    push dword [my]
    push msg2
    call printf
    add esp, 4+4
    
    pop ebp
    xor eax, eax
    ret
