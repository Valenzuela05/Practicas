// // Outputs:
// window.alert("Hola mundo, soy jasher");
// document.write("<br> Otra manera...")
// console.log("<br> Una manera por medio de consola");

// // ------------------------------------------------------------------ //

// // Declaración de variables

// let x, y, z;
// x=5;
// y=7;
// z=x+y; 
// document.write("<br>"+z);
// x="Hola mundo";
// document.write("<br>"+y+" "+x);


//Bucles y decisiones

// for(let i=0; i<10; i++){
//     window.alert("Hola persona número, "+i );
//     if(i==3){
//     }
// }
// // Ciclo while
// let j=0;
// while(j<5){
//     document.write("<br> hola mundo número "+j)
//     j++;
// }

// /* --- While, for y switch-case--- */
// let resp="si";
// while(resp=="si"){
//     let nombre=prompt("Escribe el nombre de la persona");
//     let sexo=prompt("Escribe el sexo de la persona: (H/M)");
//     let edad=prompt("Escribe el rango de edad en años de la persona (1: 0 a 13 años; 2: 14 a 21; 3: 22 en adelante):) ");
// if(sexo=="H"){
//     switch(edad){
//         case "1":
//             window.alert("Te llevaré al parque a jugar");
//         break;
//     case "2":
//         window.alert("Te llevaré a practicar algún deporte");
//     break;
//     case "3":
//         window.alert("Te recomiendo estudiar un posgrado");    
// }
    
// }else  if(sexo=="M"){
//     switch(edad){
//         case "1":
//             window.alert("Te llevare a jugar con muñecas");
//         break;
//     case "2":
//         window.alert("Te llevaré a practicar danza aérea");
//     break;
//     case "3":
//         window.alert("Te recomiendo estudiar un posgrado en humanidades");    
// }
// }
// else{
//     window.alert("No ingresaste un dato correcto en el campo 'sexo'");
// }
// resp=prompt("¿Quieres registrar a otra persona? si/no:" )
// }

// Arreglos y for
// let apoo2q=["Brisia", "Jasher", "Kike", "Fanny"];

// for(let i=0; i<apoo2q.length; i++){
//     document.write("<br>"+(i+1)+". "+apoo2q[i]);
//     if(i==2){
//         apoo2q[i]="Ángel";
//         document.write("<br>"+i+". "+apoo2q[i])
//     }
// }

//----------- Funciones -----------//
// function saludo(){
//     alert("Hola mundo");
// }
function despedida(){
    document.write("Que tengas buen día, querido near don");
}

// saludo();
despedida();

//------Calculadora básica con funciones-------//
function suma(a, b){
    alert("La suma de  " + a + " + "+ b +" es: "+(a+b));
}
function resta(a, b){
    alert("La resta de  " + a + " - "+ b +" es: "+(a-b));
}

function multplicacion(a, b){
    alert("La multipliacación de  " + a + " * "+ b +" es: "+(a*b));
}

function Division(a, b){
    alert("La división de  " + a + " / "+ b +" es: "+(a/b));
}

let resp="si";
opc=prompt("¿Qué opereación deseas realizar 1. Suma, 2. Resta, 3. Multiplicación, 4. Divición");
switch(opc){
    case "1":
        let a=parseInt(prompt("Ingresa el primer número: "));
        let b=parseInt(prompt("Ingresa el segundo número: "));
        suma(a,b);
        break;
    case "2":
        a=parseInt(prompt("Ingresa el primer número: "));
        b=parseInt(prompt("Ingresa el segundo número: "));
        resta(4, 2);
        break;
    case "3":
        a=parseInt(prompt("Ingresa el primer número: "));
        b=parseInt(prompt("Ingresa el segundo número: "));
    multplicacion(3,6);
    a=parseInt(prompt("Ingresa el primer número: "));
        b=parseInt(prompt("Ingresa el segundo número: "));
    break;
    case "4":
    Division(6,3);
    a=parseInt(prompt("Ingresa el dividendo: "));
    b=parseInt(prompt("Ingresa el divisor "));
    break;
    default:   
}
resp=prompt("¿Quiere volver a pedir otra cosa?")