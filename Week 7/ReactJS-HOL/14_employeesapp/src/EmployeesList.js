import EmployeeCard from "./EmployeeCard";
import { useTheme } from "./components/ThemeContext";
function EmployeesList(props) {
  const { theme } = useTheme();
  return (
    <div>
      <h1>Employees List</h1>
      {props.employees.map((employee) => (
        <EmployeeCard theme={theme} employee={employee} key={employee.id} />
      ))}
    </div>
  );
}
export default EmployeesList;
