function comprar(produto) {
  localStorage.setItem('produto', produto);
  window.location.href = 'checkout.html';
}
 
const form = document.getElementById('checkoutForm');
 
if(form){
 
  form.addEventListener('submit', async (e) => {
 
    e.preventDefault();
 
    const response = await fetch('http://localhost:8080/api/pagamento/pix', {
      method: 'POST'
    });
 
    const data = await response.json();
 
    document.getElementById('pixArea').innerHTML = `
      <h2>Pagamento Pix</h2>
      <img src="${data.qrCode}">
      <p>${data.pixCopiaCola}</p>
    `;
 
  });
}
