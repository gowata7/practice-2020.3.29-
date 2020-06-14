%include "io.inc"

section .data
    my dw 0x1234, 0x4567, 0x1133
    
section .bss
    you resw 1   

section .text
global CMAIN
CMAIN:
    mov ebp, esp; for correct debugging
    ; copy
    mov eax, 0
    mov ecx, 3
    
L1:
    mov ebx, [my+ eax*2]
    ;ebx = 0x45671234, ebx=0x11334567, ebx=0x1133
    mov [you+ eax*2], ebx
    inc eax
    loop L1
    
    ; print you[3]
    mov edx, you
    mov eax, 0
    
L2:
    PRINT_HEX 2, [edx+eax*2]
    NEWLINE
    inc eax
    cmp eax, 3
    jl L2                    
        
    xor eax, eax
    ret
