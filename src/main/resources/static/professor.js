document.addEventListener('DOMContentLoaded', () => {
  fetch('http://localhost:8080/professores')
    .then(response => {
      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }
      return response.json();
    })
    .then(data => {
      const tbody = document.getElementById('professor-tbody');
      tbody.innerHTML = ''; // limpa tabela

      data.forEach(professor => {
        const tr = document.createElement('tr');

        const tdNome = document.createElement('td');
        tdNome.textContent = professor.nome || '—';

        const tdDisciplina = document.createElement('td');
        tdDisciplina.textContent = professor.disciplina || '—';

        const tdEmail = document.createElement('td');
        tdEmail.textContent = professor.email || '—';

        const tdTelefone = document.createElement('td');
        tdTelefone.textContent = professor.telefone || '—';

        tr.append(tdNome, tdDisciplina, tdEmail, tdTelefone);
        tbody.appendChild(tr);
      });
    })
    .catch(error => {
      console.error('Erro ao buscar professores:', error);
      alert('Erro ao carregar a lista de professores.');
    });
});
