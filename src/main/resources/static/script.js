document.addEventListener('DOMContentLoaded', () => {
  fetch('http://localhost:8080/alunos')
    .then(response => {
      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }
      return response.json();
    })
    .then(data => {
      const tbody = document.getElementById('aluno-tbody');
      tbody.innerHTML = ''; // limpa antes de preencher

      data.forEach(aluno => {
        const tr = document.createElement('tr');

        const tdNome = document.createElement('td');
        tdNome.textContent = aluno.nome || '—';

        const tdIdade = document.createElement('td');
        tdIdade.textContent = aluno.idade !== undefined ? aluno.idade : '—';

        const tdEmail = document.createElement('td');
        tdEmail.textContent = aluno.email || '—';

        const tdTelefone = document.createElement('td');
        tdTelefone.textContent = aluno.telefone || '—';

        tr.append(tdNome, tdIdade, tdEmail, tdTelefone);
        tbody.appendChild(tr);
      });
    })
    .catch(error => {
      console.error('Erro ao buscar alunos:', error);
      alert('Erro ao carregar a lista de alunos.');
    });
});
