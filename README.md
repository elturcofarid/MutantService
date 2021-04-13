<h1>Examen Mercadolibre</h1>


Niel 2: 

Crear servicio POST → /mutant/ 

Servicio desplegado en AWS, con EKS (Docker - Kubernetes)
http://adb141e8419e441678f56969a1d9d119-2072567346.us-east-1.elb.amazonaws.com:8087/

para realizar la prueba se expone el API por medio de SWAGGER : http://adb141e8419e441678f56969a1d9d119-2072567346.us-east-1.elb.amazonaws.com:8087/swagger-ui.html

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
![stack Overflow](https://github.com/elturcofarid/MutantService/blob/master/swagger.JPG)
