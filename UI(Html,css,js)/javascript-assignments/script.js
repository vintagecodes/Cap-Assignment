function myFunction(){
    document.getElementById("summary").disabled = false;
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    console.log(name, email);

    document.getElementById("name1").innerHTML = name;
    document.getElementById("email1").innerHTML = email;
}

function summary(){
   
}


// question -1

// var num = prompt("Enter the number");
// let n = 1;
// var sum = 0;
// while(n<=num){
    
//     sum = sum + n;
//     n++;
// }
// console.log(sum);


// question -2

// var num = prompt("Enter the number");
// var sum = 0;
// for(var i=1;i<=num;i++){
//     if(i%3==0||i%5==0){
//         sum = sum + i;
//     }
// }

// console.log(sum);


// Question - 3

// var num;
// function parity(num){
//     var message = "";
//     if(num%2==0){
//         message = "even";
//     }
//     else{
//         message = "odd";
//     }

//     return message;
// }

// console.log(parity(9));


// Question - 4


// var heads = 0;
// function headsRatio(flips){
//     num = 2;
//     for(var i = 1;i<=flips;i++){

//         var n = Math.floor(Math.random() * num);
//         if(n == 1){
//             heads = heads + 1
//     }
//     }
    
//     percent = heads/flips;
//     console.log(percent);

// }

// headsRatio(10000);


// Question - 5

// function leapYear(num){

//     var date = new Date().getFullYear();
//     // console.log(date);

//     for(var i = 0; i<=num;i++){

//         if(date%4===0 && (!date%100 === 0) && date%400 !==0){
//             console.log(date)
//             date++;
//         }
//         else{
//             date++;
//         }
//     }
// }

// leapYear(20);

// Question - 7

// function listString(strings){

//     document.write(
//         "**********"+
//         "<br>"+
//         "* "+strings[0]+" *"+
//         "<br>"+
//         "* "+strings[1]+" *"+
//         "<br>"+
//         "* "+strings[2]+" *"+
//         "<br>"+
//         "* "+strings[3]+" *"+
//         "<br>"+
//         "* "+strings[4]+" *"+
//         "<br>"+
//         "***********"
        
        
//         );

// }

// let str = ["Hello","World","in","a","frame"];
// listString(str);


