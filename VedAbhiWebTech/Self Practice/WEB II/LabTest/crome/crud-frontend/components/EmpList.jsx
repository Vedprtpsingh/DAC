import EmpCard from './EmpCard';

function EmpList({ data, onUpdate, onDelete }) {
  if (!data?.length) {
    return <p className="text-muted">No employees found.</p>;
  }

  return (
    <div>
      <h2>List of Employees</h2>
      <div className="row">
        {data.map((emp) => (
          <EmpCard
            key={emp._id}
            emp={emp}
            onUpdate={onUpdate}
            onDelete={onDelete}
          />
        ))}
      </div>
    </div>
  );
}

export default EmpList;