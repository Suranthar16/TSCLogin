


function validate() {
     console.log("hello");
      var name=document.getElementById('name').value;
      var age=document.getElementById('age').value;
      var dob=document.getElementById('dob').value;
      var email=document.getElementById('email').value;
      var mobile=document.getElementById('mobile').value;
      var qualification=document.getElementById('qualification').value;
      var gender=document.getElementById('gender').value;
      var emailReg = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
      var letters = /^[A-Za-z]+$/;
      var phoneno = /^\d{10}$/;
 
      
   
      
         if( name==="") {
            alert( "Please provide your name!" );
            return false;
         }else if(!letters.test(name)){
			 alert( "Only Alphabets allowed inside Name!" );
            return false;
		 }
         
         
          if( age === "" ) {
            alert( "Please provide your age!" );
            return false;
         }else if(age<1||age>100){
			 alert("Please provide valid Age!");
		 }
         
          
         if( dob === "" ) {
            alert( "Please provide your DOB!" );
            return false;
         }
         
         if( email === "" ) {
            alert( "Please provide your Email!" );
            return false;
         }
         if(!emailReg.test(email)){
			 alert("Please provide valid Wmail!")
			 return false;
		 }
         	
         
         if( mobile === "" ) {
            alert( "Please provide your mobile num!" );
            return false;
         }else if(!phoneno.test(mobile)){
			 alert("Please provide valid Number!");
		 }
      
         
         if( qualification === "" ) {
            alert( "Please provide your qualification!" );
            return false;
         }
         
          
         if( gender === "" ) {
            alert( "Please provide your gender!" );
            return false;
         }
         
         else{
			  document.getElementById("TcsForm").action="TcsServlet";
			  document.getElementById("TcsForm").method="post" ;
			  document.getElementById("TcsForm").submit(); 
		 }
         
 }
 
 function errorMessage(){
	 
 }
 
 
 
 
 
 
 
 
 /*const form = document.querySelector('#form')
const name = document.querySelector('#name');
const age = document.querySelector('#age');
const dob = document.querySelector('#dob');
const email = document.querySelector('#email');
const mobile = document.querySelector('#mobile');
const qualification = document.querySelector('#qualification');
const gender = document.querySelector('#gender');

form.addEventListener('submit',(e)=>{
    
    if(!validateInputs()){
        e.preventDefault();
    }
})
function validateInputs(){
	
    const name = name.value.trim()
    const age = age.value.trim();
    const dob = dob.value.trim();
    const email = email.value.trim();
    const mobile = mobile.value.trim();
    const qualification = qualification.value.trim();
	const gender = gender.value.trim();


    let success = true
    
    if(nameVal===''){
        success=false;
        setError(name,'name is required')
    }
    else{
        setSuccess(name)
    }
    
    
    if(ageVal===''){
        success=false;
        setError(age,'age is required')
    }
    else{
        setSuccess(age)
    }
    
    
    
    if(dobVal===''){
        success=false;
        setError(dob,'dob is required')
    }
    else{
        setSuccess(dob)
    }
    
    
    if(emailVal===''){
        success = false;
        setError(email,'Email is required')
    }
    else if(!validateEmail(emailVal)){
        success = false;
        setError(email,'Please enter a valid email')
    }
    else{
        setSuccess(email)
    }
    
    
    if(mobileVal === ''){
        success= false;
        setError(mobile,'mobile is required')
    }
    else if(mobileVal.length<6){
        success = false;
        setError(mobile,'mobile must be atleast 6 characters long')
    }
    else{
        setSuccess(mobile)
    }
    
    
    if(qualificationVal===''){
        success=false;
        setError(qualification,'qualification is required')
    }
    else{
        setSuccess(qualification)
    }
    
    
    if(genderVal===''){
        success=false;
        setError(gender,'gender is required')
    }
    else{ 
        setSuccess(gender)
    }
    
    return Ssuccess;
   }
    const validateEmail = (email) => {
    return String(email)
      .toLowerCase()
      .match(
        /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/
      );
  };  
*/