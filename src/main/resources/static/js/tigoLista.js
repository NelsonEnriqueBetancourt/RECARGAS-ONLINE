$(document).ready(function() {
    cargarRecargas();
  $('#recargas').DataTable();
});

async function cargarRecargas(){
  const request = await fetch('api/tigo/List', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const recargas = await request.json();

  let listadoHtml ='';
  for (let Tigo of recargas){
    let usuarioHtml  =  '<tr><td>'+Tigo.id+'</td><td>'+ Tigo.nombreVendedor +'</td><td>'+ Tigo.numeroPhone +'</td><td>'+Tigo.valorRecarga+'</td></tr>';
    listadoHtml += usuarioHtml;
  }

document.querySelector('#recargas tbody').outerHTML=listadoHtml;


}


