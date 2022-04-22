class User {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

}
function printName(user) {
    console.log("name os user " + user.name);
}
function printAge(user) {
    console.log("name os user " + user.age);
}

export default User;

export { printName, printAge }