function makeCustomer() {
    let customer = {};
    let _id;
    let _name;

    customer.setId = (id) => {
        _id = id
    }
    customer.setName = (name) => {
        _name = name;
    }

    customer.getDetails = () => {
        return `name is ${_name} and id is ${_id}`
    }

    return customer;
}

const obj=makeCustomer();
 obj.setName("rohan");
 obj.setId(12);
 console.log(obj.getDetails());