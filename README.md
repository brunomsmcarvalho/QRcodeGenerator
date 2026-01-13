# qrcode_generator
A basic desktop application where the user insert a text than he desire to turn as QRCode and the program build that and store locally.

# Tools
Java FX FrameWork
ZXing Library
Scene Builder ("Resource for drag and drop creation")

# Como executar no NetBeans

## Pré-requisitos
- NetBeans IDE (versão 12 ou superior recomendada)
- Java JDK 21 ou superior
- Maven (geralmente incluído no NetBeans)

## Passos para executar

1. **Abrir o projeto no NetBeans:**
   - Abra o NetBeans
   - File → Open Project
   - Navegue até a pasta `qrcode_gen`
   - Selecione a pasta e clique em "Open Project"

2. **Aguardar o Maven baixar as dependências:**
   - O NetBeans irá automaticamente baixar as dependências do Maven
   - Aguarde até que o processo termine (verifique a barra de status)

3. **Executar o projeto:**
   - Clique com o botão direito no projeto no painel "Projects"
   - Selecione "Run" ou pressione F6
   - Alternativamente, use o menu: Run → Run Project

4. **Executar via Maven (alternativa):**
   - Clique com o botão direito no projeto
   - Selecione "Custom" → "Goals..."
   - Digite: `clean javafx:run`
   - Clique em "OK"

## Classe Principal
A classe principal é `com.projetos.qrcode_gen.Launcher`

## Notas
- O projeto usa JavaFX 21.0.6
- Requer Java 21 ou superior
- Os QR codes gerados são salvos na pasta `qrcodes` no diretório home do usuário

# ZXing dependencies

# Overview application
<img width="478" height="273" alt="image" src="https://github.com/user-attachments/assets/2ab0a5dc-a577-478b-8e6e-83519b7a7b47" />

---
<img width="743" height="524" alt="image" src="https://github.com/user-attachments/assets/0f161677-0ec6-4e7a-ad71-f1aa4044dcb8" />

---
<img width="930" height="527" alt="image" src="https://github.com/user-attachments/assets/06a4f8d6-b99c-4764-8c00-c50adc1d2d22" />

---
<img width="654" height="301" alt="image" src="https://github.com/user-attachments/assets/6f1b4d48-b3f0-48e9-bf3e-fe6434972469" />
