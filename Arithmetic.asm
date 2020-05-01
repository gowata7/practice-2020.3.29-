%include "io64.inc"

section .data
    msg1 db 'Input data1: ', 0x00
    msg2 db 'Input data2: ', 0x00
section .bss
    ad resw 1
    sb resw 1
    ml resw 1
    dv resw 1
    rm resw 1

section .text
global CMAIN
CMAIN:
    mov rbp, rsp; for correct debugging
    ; ax를 합으로 두고 각 연산자별로 합 메모리 변수를 따로 두는게 팁
    PRINT_STRING msg1
    GET_DEC 2, bx
    PRINT_DEC 2, bx
    NEWLINE
   
    PRINT_STRING msg2
    GET_DEC 2, cx
    PRINT_DEC 2, cx
    NEWLINE
    
    mov ax, bx
    add ax, cx ; ax = ax + cx
    mov [ad], ax
    PRINT_STRING '+ : '
    PRINT_DEC 2, [ad]
    NEWLINE
    
    mov ax, bx
    sub ax, cx ; ax = ax - cx
    mov [sb], ax
    PRINT_STRING '- : '
    PRINT_DEC 2, [sb]
    NEWLINE
    
    ; bl과 cl값은 30,50으로 정해져있다.
    ; ax = al(bl)*cl
    ; 결과값은 무조건 ax
    mov al, bl
    mul cl
    mov [ml], ax
    PRINT_STRING '* : '
    PRINT_DEC 2, [ml]
    NEWLINE
    
    ; 7(ax)/2(cl) = 3(AL:몫), 1(AH:나머지)
    mov al, bl
    div cl
    mov [dv], al
    mov [rm], ah
    PRINT_STRING '/(몫) : '
    PRINT_DEC 2, [dv]
    NEWLINE
    
    PRINT_STRING '/(나머지) : '
    PRINT_DEC 2, [rm]
    NEWLINE
    
    xor rax, rax
    ret
