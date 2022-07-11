// Call the dataTables jQuery plugin
$(document).ready(function() {
  loadUsers();
  $('#usersTable').DataTable();
});

async function loadUsers() {
    const request = await fetch('api/users', {
    method: 'GET',
    headers: {
        'Accept': 'application/json',
        'Content-type': 'application/json'
    }});
    const usersList = await request.json();
    '<a href="#" class="btn btn-danger btn-circle"><i class="fas fa-trash"></i></a>'
    let listOfUsersHtml = '';
    for (let user of usersList ) {
        let innerUser = '<tr>'
                            + '<td>' + user.id + '</td>'
                            + '<td>' + user.first_name + ' ' + user.last_name + '</td>'
                            + '<td>' + user.email + '</td>'
                            + '<td>' + user.phone + '</td>'
                            + '<td>' + '<a href="#" onclick="deleteUser('+ user.id +')" class="btn btn-danger btn-circle"><i class="fas fa-trash"></i></a>' + '</td>'
                        + '</tr>';
        listOfUsersHtml += innerUser;
    }
    document.querySelector('#usersTable tbody').outerHTML = listOfUsersHtml;
}

async function deleteUser(id){
    if (confirm('¿Seguro de eliminar al usuario?')) {
        const request = await fetch('api/users/' + id, {
        method: 'DELETE',
        headers: {
            'Accept': 'application/json',
            'Content-type': 'application/json'
        }});
        location.reload();
    }

}