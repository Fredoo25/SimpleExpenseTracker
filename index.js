function createNewExpense(e){
    e.preventDefault();
    let expense = {
        description: document.getElementById("description").value,
        amount: +document.getElementById("amount").value,
        date: document.getElementById("date").value
    }
    fetch("http://localhost:8080/expense",
        {
            method: 'POST',
            headers: {'Content-Type': 'application/json',},
            body: JSON.stringify(expense),
        }
    ).then(()=>window.location.reload(true))
}
function deleteAll(e){
    e.preventDefault();
    fetch("http://localhost:8080/expenses",
    {
        method: 'DELETE',
        headers: {'Content-Type': 'application/json',},
    }
).then(()=>window.location.reload(true))
}
async function getAllExpenses(){
    let response = await fetch("http://localhost:8080/expenses");
    let body = await response.json();
    let expenses = body.map(expense => {
        let date = new Date(expense.date)
        date = new Date(date.getTime()  + date.getTimezoneOffset() * 60 * 1000)
        return (
            `<li class="list-group-item expense">
                <p>${date.getMonth()+1}/${date.getDate()}/${date.getFullYear()}</p>
                <p>${expense.description}</p>
                <p>$${expense.amount}</p>
            </li>`
        );
    }).join("");
    document.getElementById("expenses").innerHTML = expenses;
}
getAllExpenses();