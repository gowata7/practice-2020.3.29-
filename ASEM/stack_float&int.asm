%include "io.inc"

extern printf

section .data
msg:    db  "Hello World : %c %s of length %d %d %X %e %E", 10, 0
char1:  db  'a'
str1:   db  "string", 0
len:    equ $-str1
int1:   dd  1234567
hex1:   dd  0x6789ABCD
flt1:   dd  5.327e-30       ; 32비트 실수
flt2:   dq  -123.456789e300 ; 64비트 실수 --> -1.23456789ㄷ302

section .bss
flttmp: resq 1  ; 64비트

section .text
global CMAIN
CMAIN:
    push    ebp
    mov     ebp, esp
    
    fld     dword[flt1]     ; 32비트 flt1를 64bit로 변환, 실수형 데이터를 load
    fstp    qword[flttmp]   ; floating load makes 80bit,
                            ; store as 64bit, 실수형 데이터를 store
    
    push    dword[flt2+4]   ; 64bit floating point (bottom)
    push    dword[flt2]     ; 64bit floating point (top)
    push    dword[flttmp+4] ; 64bit floating point (bottom)
    push    dword[flttmp]   ; 64bit floating point (top)
    push    dword[hex1]
    push    dword[int1]     ; integer data
    push    dword len
    push    dword str1
    push    dword[char1]
    push    dword msg
    call    printf
    add     esp, 40         ; pop stack 10*4 bytes
    
    pop     ebp
    xor     eax, eax
    ret
