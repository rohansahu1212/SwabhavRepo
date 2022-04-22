const demofunc = async () => {
    const response = await fetch("rohan.json");

    const data = await response.json();
    return data;
};

demofunc().then((data) =>{
    console.log("data is----- ",data);
} ).catch((err) =>{
    console.log("error is here----",err)
} )
