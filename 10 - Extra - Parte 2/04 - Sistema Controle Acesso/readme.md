# Sistema de controle de acesso

Escreva um programa que simula um sistema de controle de acesso rudimentar. O sistema deve solicitar do usuário uma senha, que é um número inteiro. Caso o usuário entre com uma senha incorreta, o programa deve imprimir na tela a mensagem Acesso negado (senha incorreta). Caso a senha esteja correta, o programa deve imprimir Acesso autorizado. Além disso, o usuário tem um número máximo de tentativas até que o sistema seja bloqueado; se isso ocorrer, o programa deve imprimir Sistema bloqueado e encerrar imediatamente.

Considere que a senha é 314159 e que o máximo número de tentativas é 3.

## Restrições

- Utilize o comando while ou do/while.
- Tanto a senha quando o máximo número de tentativas devem estar definidos no seu código utilizando a diretiva #define.

## Exemplos

```text
Entre com a senha: 271828
Acesso negado (senha incorreta)
Entre com a senha: 314159
Acesso autorizado

Entre com a senha: 123456
Acesso negado (senha incorreta)
Entre com a senha: 999999
Acesso negado (senha incorreta)
Entre com a senha: 314159
Acesso autorizado

Entre com a senha: 31415
Acesso negado (senha incorreta)
Entre com a senha: 3141592
Acesso negado (senha incorreta)
Entre com a senha: 1000
Acesso negado (senha incorreta)
Sistema bloqueado

Entre com a senha: 314159
Acesso autorizado
```