# String API</h2>
API służące do pozyskiwania informacji na temat przekazanego ciągu znaków.
Aby skorzystać z API, należy wysłać żądanie GET pod adres, na którym jest ono uruchomione.

## Składnia
```
ścieżka_do_api/{tekst}
```
## Przykład
```
http://localhost:8080/api/hElLo%20WoRlD1337%20aaa
```
## Wynik
Dla przekazanych danych wejściowych otrzymamy wynik w formacie JSON:
```json
{
  "text": "hElLo WoRlD1337 aaa",
  "digits": 4,
  "upperCase": 5,
  "lowerCase": 8,
  "whitespace": 2,
  "specialCharacters": 0
}
```
