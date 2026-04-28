export default function EmpCard({ emp, onUpdate, onDelete }) {
  return (
    <div className="col-md-6 mb-3">
      <div className="card h-100">
        <div className="row g-0 align-items-center p-3">
          <div className="col-md-5">
            <h5 className="mb-0 fw-semibold">{emp.name}</h5>
          </div>
          <div className="col-md-5">
            <p className="mb-0 text-muted small">{emp.address}</p>
            <p className="mb-0 fw-medium">
              ₹ {Number(emp.salary).toLocaleString()}
            </p>
          </div>
          <div className="col-md-2 d-flex flex-column gap-1">
            <button
              className="btn btn-sm btn-warning"
              onClick={() => onUpdate(emp)}
              aria-label={`Edit ${emp.name}`}
            >
              Edit
            </button>
            <button
              className="btn btn-sm btn-danger"
              onClick={() => {
                if (
                  window.confirm(
                    `Are you sure you want to delete ${emp.name}?`,
                  )
                ) {
                  onDelete(emp._id);
                }
              }}
              aria-label={`Delete ${emp.name}`}
            >
              Delete
            </button>
          </div>
        </div>
      </div>
    </div>
  );
}
