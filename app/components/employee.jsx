const React = require('react');

export default class Employee extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.employee.id}</td>
				<td>{this.props.employee.name}</td>
				<td>{this.props.employee.department}</td>
			</tr>
		)
	}
}