$(document).ready(function() {


});


async function registrarRecarga(){
    let datos={};
    datos.nombreVendedor= document.getElementById('txtNombre').value;
    datos.numeroPhone= document.getElementById('txtNumero').value;
    datos.valorRecarga= document.getElementById('txtValor').value;


  const request = await fetch('api/uff/Save', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
      body: JSON.stringify(datos)
  });


  window.location.href='recarga-uff.html'

}