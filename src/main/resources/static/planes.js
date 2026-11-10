const contenedorPLanes = document.getElementById("planes")
console.log(contenedorPLanes)
async function cargarPlanes(){
    const respuesta = await(fetch("/api/plan"));
    if(respuesta.ok){
        const planes = await(respuesta.json());
        console.log(planes);
        for(plan of planes){
            const tarjeta = document.createElement("article");
            const nombre = document.createElement("h2");
            nombre.textContent = plan.nombrePlan;

            const descripcion = document.createElement("p");
            descripcion.textContent = plan.descripcion;

            tarjeta.append(nombre, descripcion)

            contenedorPLanes.append(tarjeta);
        }
    }
    
}
cargarPlanes();