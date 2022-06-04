class Customer{

    constructor(public firstName: string, public lastName: string){


    }


    get fullName(){
        return this.firstName+" "+this.lastName;
    }

    set fullName(fullname:string){
        var splitted = fullname.split(" ");
        this.firstName=splitted[0];
        this.lastName=splitted[1];
    }
    

}

let c=new  Customer("sachin","tendulkar")
console.log(c.firstName);
console.log(c.lastName);
console.log(c.fullName);
c.fullName="rohan sahu";
console.log(c.fullName)


