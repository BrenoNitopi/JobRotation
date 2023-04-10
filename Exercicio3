import pandas as pd

path = "D:\Downloads\dados.json"
df = pd.read_json(path)

tabelaFiltrada = df[df['valor'] > 0]
#(tabelaFiltrada)

maiorValorMes = tabelaFiltrada.max()
menorValorMes = tabelaFiltrada.min()

print('O maior valor de faturamento do mês foi: R$%.2f'% maiorValorMes['valor'])
print('O menor valor de faturamento do mês foi: R$%.2f'% menorValorMes['valor'])
print('O menor valor de faturamento do mês, considerando dias sem faturamento, foi de: R$%.2f' % df['valor'].min())

soma = 0;
for value in tabelaFiltrada['valor']:
    soma = soma + value

dias = tabelaFiltrada['dia'].count()
media = soma / dias

print('\nMédia dos valores: R$%.2f'%media)
contador = 0

for value in tabelaFiltrada['valor']:
    if value > media:
        contador += 1

print("Quantidade de dias de faturamento acima da média mensal:", contador)

