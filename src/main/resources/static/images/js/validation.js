


let form = document.getElementById('.needs-validation');
form.addEventListener('#maFormulaire', valider);

function valider(e)
{
if (form.checkValidity() == false)

    {

        e.preventDefault();

     }

form.classList.add('was-validated');
}
