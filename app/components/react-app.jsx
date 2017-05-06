'use strict';
const React = require('react');
var axios = require('axios');

import EmployeeList from './employee-list.jsx'

export default class ReactApp extends React.Component {

	constructor(props) {
		super(props);
		this.state = {employees: []};
		this.Axios = axios.create({
		    baseURL: "/employee",
		    headers: {'content-type': 'application/json', 'creds':'user'}
		});
	}

	componentDidMount() {
		let _this = this;
		this.Axios.get('/get')
		  .then(function (response) {
		     console.log(response);
		    _this.setState({employees: response.data});
		  })
		  .catch(function (error) {
		    console.log(error);
		  });
	}

	render() {
		return (
				<div>
				  <EmployeeList employees={this.state.employees}/>
		        </div>
			)
	}
}