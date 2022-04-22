const dataService= function(){
    let obj={};
    obj.doTask1=()=>{
        console.log("doing task 1");
    }


    obj.doTask2=()=>{
        console.log("doing task 2");

    }
    return obj;
}();

//const dataObj=dataService();
dataService.doTask1();
//dataObj.doTask2();