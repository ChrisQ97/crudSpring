// Call the dataTables jQuery plugin
$(document).ready(function() {
  loadUsers();
  $('#usersTable').DataTable();
});

async function loadUsers() {
    const request = await fetch('users', {
    method: 'GET',
    headers: {
        'Accept': 'application/json',
        'Content-type': 'application/json'
    }});
    const usersList = await request.json();
    let listOfUsersHtml = '';
    for (let user of usersList ) {
        let innerUser = '<tr>'
                            + '<td>' + user.id + '</td>'
                            + '<td>' + user.first_name + ' ' + user.last_name + '</td>'
                            + '<td>' + user.id + '</td>'
                            + '<td>' + user.email + '</td>'
                            + '<td>' + user.phone + '</td>'
                            + '<td>' + user.id + '</td>'
                        + '</tr>';
        listOfUsersHtml += innerUser;
    }
    document.querySelector('#usersTable tbody').outerHTML = listOfUsersHtml;
}