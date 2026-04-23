
const data = require('./movies.json')

for(const c of data){
    console.log(`ID = ${c.id} - ${c.Title}`)
}