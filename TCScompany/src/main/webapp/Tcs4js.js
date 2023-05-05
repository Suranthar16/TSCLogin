/**
 * 
 */
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
			  console.log("in to servlet");
			  document.getElementById("Tcs4Form").action="TcsupdateServlet";
			  document.getElementById("Tcs4Form").method="post" ;
			  document.getElementById("Tcs4Form").submit();

			  
		 }
         
 }
 