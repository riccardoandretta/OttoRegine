Data una schacchiera 8x8
posizionare 8 regine degli scacchi
in modo che non si possano mangiare tra di loro

```
|---|---|---|---|
|   | Q |   |   |
|---|---|---|---|
|   |   |   | Q |
|---|---|---|---|
| Q |   |   |   |
|---|---|---|---|
|   |   | Q |   | 
|---|---|---|---|
```

Soluzione parziale= lista di numeri (colonne) tra 0 e N-1

Soluzione totale= soluzione parziale con esattamente N elementi (righe)

La soluzione parziale viene costruita aggiungendo una nuova regina per volta, nella riga successiva. Metterò la regina nella riga==livello.
Le mosse possibili ad un certo livello dipendono da quali caselle sono "libere" dall'attacco delle regine poste nelle righe (livelli) precedenti.

Una volta trovata la prima soluzione, la ricerca può terminare.