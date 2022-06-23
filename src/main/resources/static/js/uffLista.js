$(document).ready(function() {
    cargarRecargas();
  $('#recargas').DataTable();
});

async function cargarRecargas(){
  const request = await fetch('api/uff/List', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const recargas = await request.json();

  let listadoHtml ='';
  for (let Uff of recargas){
    let usuarioHtml  =  '<tr><td>'+Uff.id+'</td><td>'+ Uff.nombreVendedor +'</td><td>'+ Uff.numeroPhone +'</td><td>'+Uff.valorRecarga+'</td></tr>';
    listadoHtml += usuarioHtml;
  }

document.querySelector('#recargas tbody').outerHTML=listadoHtml;


}


