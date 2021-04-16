<h1>Examen Mercadolibre</h1>

<h3>Arquitecturas utilizada</h3>

<ol>
  <li>Arquitectura de microservicios</li>
  <li> Arquitectura por capas</li>
  <li> Arquitectura cliente/servidor  </li>
 </ol>
 
<h3> Patrones de diseño </h3>
<ol>
    <li> MVC</li>
    <li> Facade</li>
   <li> Patron repository (DAO)</li>
 </ol>
 
<h3> Paradigmas de programación </h3>
 <ol>
  <li> Programación orientada a aspectos</li>
  <li>Programación orientada a objetos</li>
  </ol>
 
 <h3>Herramientas Adicionales</h3>
  <ol>
  <li>Api Swagger </li>
  <li>Base de datos MongoDb</li>
  <li>Docker - contenerización de la aplicación</li>
  <li>Kubernetes - Adminitración de contenedores</li>
  </ol>
 
 Pasos para probar:
 <ol>
 <li>aceder a la url: http://adb141e8419e441678f56969a1d9d119-2072567346.us-east-1.elb.amazonaws.com:8087/swagger-ui.html</li>
 <li>Escoger el metodo POST del controlador Mutant Controller</li>
 <li>Escoger la opción TRY of out</li>
 <li>cambiar el json de muestra por :  Prueba Humano: { "dna":["TTGTCC","TTGTTC","TTATGT","TGACGG","CCTCCC","TCTCTG"] }      o por  Prueba Mutante: { "dna":["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"] }</li>
 <li>Dar click en EXCECUTE</li> 
 </ol>
  

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

![coverage](https://github.com/elturcofarid/MutantService/blob/master/coverage.PNG)



<h2>Pruebas Jmeter</h2>

![jmeter](https://github.com/elturcofarid/MutantService/blob/master/Captura.PNG)
