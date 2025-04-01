# Convertendo Tipos Primitivos!

> O Java sempre analisa **Os TIPOS** acima dos valores. Sempre que se converta de um tipo "maior" para "menor", como de `Long` para `Int`, o Java **EXIGE** que o programador faça uma notação explicita, pois tal conversão implica em **perder informações** 

## Cast

### Byte -> Short ->  Int -> Long

Não há perda de informação, **NÃO EXIGE** conversão explicita.

Conversão ocorre _implicitamente_

### Long -> Int -> Short -> Byte

Há perda de informação, **EXIGE** conversão explicita.

Conversão ocorre _EXPLICITAMENTE_

### Int -> Float

Não há perda de informação, **NÃO EXIGE** conversão explicita.

Conversão ocorre _implicitamente_

### Float -> Int

Há perda de informação, **EXIGE** conversão explicita.

Conversão ocorre _EXPLICITAMENTE_
