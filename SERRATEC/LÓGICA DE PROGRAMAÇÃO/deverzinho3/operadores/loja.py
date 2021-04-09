# while True:
#     try:
#         n = int(input('digite um número de 3 dígitos: '))
#         if 100 <= n <= 999: # é um número de 3 dígitos
#             break
#         print('O número deve ter 3 dígitos')
#     except ValueError:
#         print('Não foi digitado um número')
#     if n>999:
#         print("espere para entrar")



while True:
    try:
        n = int(input('digite um número de pessoas que irao entrar: '))
        if 1<= n <= 20: # é um número de 2 digitos
            break
        print("certo, agora:")
    except ValueError:
        print('Não foi digitado um número')
    if n>=20:
        print("espere para entrar")
    elif n<20:
    	print("pode entrar")
