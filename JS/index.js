// index.js

// fetc api

setTimeout(()=>{
console.log('============> After 4 seconds <=================');
document.getElementById("data").innerHTML = 'Time out ....'; 

},4000)


    fetch('https://jsonplaceholder.typicode.com/users')
    .then(response => response.json())
    .then(users => {
        document.getElementById("data").innerHTML = JSON.stringify(users);    // js
        // code for rect js
        // code for angular
    })



  setInterval(() => {
      
  }, interval);


// plan js code 




let indianClock = document.querySelector("#indian-clock");
let dubaiClock = document.querySelector("#dubai-clock");
let americanClock = document.querySelector("#american-clock");

function clock(props) {

    return (

        `
        
       
        <div class="card">
        <div class="card-header">Clock</div>
        <div class="card-body">
         <p> ${props.s1} </p>   
         <p> ${new Date().toLocaleTimeString('en-US', { timeZone: props.s1 })} </p>

    
        </div>
        

        `

    );


}

setInterval(() => {
    indianClock.innerHTML = clock({ s1: 'asia/kolkata' })
    dubaiClock.innerHTML = clock({ s1: 'asia/dubai' })
    americanClock.innerHTML = clock({ s1: 'America/New_york' })
}, 1000)




