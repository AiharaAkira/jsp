function call(){
    let i1Input = document.myForm.i1;
    let i2Input = document.myForm.i2;
    let i3Input = document.myForm.i3;
    let i4Input = document.myForm.i4;
    let i5Input = document.myForm.i5;

    if(isEmpty(i1Input) || lessThan(i1Input, 3)||containKr(i1Input)){
        alert('필수입력 에러');

        i1Input.focus();
        i1Input.value = "";
        return false;
    }


    // if(lessThan(i1Input, 3)){
    //     alert('글자수 확인');

    //     i1Input.focus();
    //     i1Input.value = "";
    //     return false;
    // }

    if(lessThan(i2Input, 3)||moreThan(i2Input, 10)){
        alert('3글자 이상 입력');
        i2Input.focus();
        i2Input.value="";
        return false;
    }

   

    if(lessThan(i3Input, 5) ){
        alert('비밀번호 확인');
        i3Input.focus();
        i3Input.value = "";
        return false;
    }

    if(equalData(i3Input, i4Input)){
        alert('비밀번호 재확인');
        i4Input.focus();
        i4Input.value = "";
        return false;
    }

    if(notContains(i3Input, "1234567890") || notContains(i3Input, "QWERTYUIOPASDFGHJKLZXCVBNM")){
        alert('대문자 숫자 포함');
        i3Input.focus();
        i3Input.value = "";
        return false;
    }
    
 
    if(isNotNumber(i5Input)||isEmpty(i5Input)){
        alert('공백없이 숫자만 입력');
        i5Input.focus();
        i5Input.value = "";
        return false;
    }

   
   return true; 

}