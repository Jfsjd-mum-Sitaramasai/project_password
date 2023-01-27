const buttonCalled=document.getElementById("button");
buttonCalled.addEventListener("click",generatePassword);
function generatePassword(){
    var name1=document.getElementById("firstname").value;
    var name2=document.getElementById("middlename").value;
    var name3=document.getElementById("lastname").value;
    
    var pass=document.getElementById("password")
   
        pass.innerHTML =
            name1.slice(0,2) +
         name2.slice(0,2)+name3.slice(0,2)+Math.floor((Math.random()*9)+1)+Math.floor((Math.random()*9)+1)+Math.floor((Math.random()*9)+1);

         var password=pass.innerHTML;

    let request = new Request('http://localhost:8080/createpassword',{
        headers: new Headers({
            
            'Content-type': 'application/json'
        }),
        method: 'POST',
        body: JSON.stringify({
            "name1": name1,
            "name2":name2,
            "name3":name3,
            "name4":password
        })
});
fetch(request).then((response)=>{
    console.log(response);
    response.json().then((data)=>{
        console.log(data);
    })
})
    
    
       
}
