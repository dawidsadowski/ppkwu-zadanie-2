<h2>String API</h2>
API służące do pozyskiwania informacji na temat przekazanego ciągu znaków.

<h2>Składnia</h2>
```
ścieżka_do_api/{tekst}
```
Przykład:
```
http://localhost:8080/api/ciąg%20znaków123
```

<h2>Dane wejściowe</h2>
Aby skorzystać z API, należy wysłać żądanie GET pod adres, na którym jest ono uruchomione (dla przykładu użyjemy adresu `http://localhost:8080/api/`).

Przykładowe żądanie GET:
```
http://localhost:8080/api/hElLo%20WoRlD1337%20aaa
```
<h2>Dane wyjściowe</h2>
Dla przekazanych danych wejściowych otrzymamy wynik w formacie JSON:
```json
{
  "text": "hElLo WoRlD1337 aaa",
  "digits": 4,
  "upperCase": 5,
  "lowerCase": 8,
  "whiteSpace": 2,
  "specialCharacters": 0
}
```
