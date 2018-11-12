const React = require('react');
const ReactDOM = require('react-dom');

import Input from './Input'


class App extends React.Component {

    render() {
        return (
            <div>
                <Input />
            </div>
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('app')
)
