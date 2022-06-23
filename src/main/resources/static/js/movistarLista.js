$(document).ready(function() {
    cargarRecargas();
  $('#recargas').DataTable();
});

async function cargarRecargas(){
  const request = await fetch('api/movistar/List', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const recargas = await request.json();

  let listadoHtml ='';
  for (let Movistar of recargas){
    let usuarioHtml  =  '<tr><td>'+Movistar.id+'</td><td>'+ Movistar.nombreVendedor +'</td><td>'+ Movistar.numeroPhone +'</td><td>'+Movistar.valorRecarga+'</td></tr>';
    listadoHtml += usuarioHtml;
  }

document.querySelector('#recargas tbody').outerHTML=listadoHtml;


}


