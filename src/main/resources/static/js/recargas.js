$(document).ready(function() {
    cargarRecargas();
  $('#recargas').DataTable();
});

async function cargarRecargas(){
  const request = await fetch('api/comcel/List', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const recargas = await request.json();

  let listadoHtml ='';
  for (let Comcel of recargas){
    let usuarioHtml  =  '<tr><td>'+Comcel.id+'</td><td>'+ Comcel.nombreVendedor +'</td><td>'+ Comcel.numeroPhone +'</td><td>'+Comcel.valorRecarga+'</td></tr>';
    listadoHtml += usuarioHtml;
  }

document.querySelector('#recargas tbody').outerHTML=listadoHtml;


}


