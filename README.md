# Prova Final – Andrey Kusman

Este projeto contém as cinco questões da prova final, cada uma organizada em sua própria pasta dentro de `src`.



Cada questão possui sua própria classe principal (`MainQ1`, `MainQ2`, etc).

---

## 🔧 Como compilar tudo

Abra o terminal dentro da pasta **src**, onde estão as pastas Questao1, Questao2, etc.

Execute:

### **Windows PowerShell**
```powershell
Get-ChildItem -Recurse -Filter *.java | ForEach-Object { javac -d . $_.FullName }

Como rodar:
java Questao1.MainQ1
java Questao2.MainQ2
java Questao3.MainQ3
java Questao4.MainQ4
java Questao5.MainQ5
