<h1>Examen Mercadolibre</h1>


Niel 2: 

Crear servicio POST → /mutant/ 

Servicio desplegado en AWS, con EKS (Docker - Kubernetes)
http://adb141e8419e441678f56969a1d9d119-2072567346.us-east-1.elb.amazonaws.com:8087/

para realizar la prueba se expone el API por medio de SWAGGER : http://adb141e8419e441678f56969a1d9d119-2072567346.us-east-1.elb.amazonaws.com:8087/swagger-ui.html

1. Escoja el metodo a ejecutrar (POST o GET)
2. click en TRY IT OUT
3. Si es el metodo Post reemplace la palabra String por la cadena a validar.
4. Click en Excecute

![stack Overflow](https://github.com/elturcofarid/MutantService/blob/master/swagger.JPG)

Prueba Humano: 
{
   "dna":["TTGTCC","TTGTTC","TTATGT","TGACGG","CCTCCC","TCTCTG"]
}


Prueba Mutante:
{
"dna":["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]
}


<h2>Coverage</h2>

(https://github.com/elturcofarid/MutantService/blob/master/coverage.PNG)



<h2>Pruebas Jmeter</h2>

