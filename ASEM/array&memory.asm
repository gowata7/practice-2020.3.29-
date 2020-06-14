%include "io.inc"
section .data
    a   dd  30,50,20,70,60
    b   times 5 dw 0
    a1  dw  0x1234, 0x5678, 10
    
section .bss
    c   resb    3
    d   resw    4

section .text
global CMAIN
CMAIN:
    mov eax, a
    PRINT_HEX 4, eax    ;4byte 단위 16진수로 출력
    NEWLINE
    
    mov eax , [a]
    PRINT_HEX 4, eax    ;4byte 단위 16진수로 출력

    xor eax, eax
    ret
