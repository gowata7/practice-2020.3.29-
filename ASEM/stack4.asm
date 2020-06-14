%include "io.inc"

extern _printf

section .data
msg     db '%d bigger than 5', 10, 0

section .text
global CMAIN
CMAIN:
    push ebp
    mov ebp, esp
    
j10:
    mov eax, 10
    cmp eax, 5
    jg than ; eax가 5보다 크면 than 으로
    jmp end ; 아니면 end
    
than:
    push eax
    push msg
    call _printf
    add esp, 8
    
end:
    pop ebp    
    xor eax, eax
    ret
