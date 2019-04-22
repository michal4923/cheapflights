import React, { Component } from 'react';
import { connect } from 'react-redux';
import { simpleAction } from './actions/simpleActions';
import logo from './logo.svg';
import './App.css';

const mapStateToProps = state => ({
  ...state
});

const mapDispatchToProps = dispatch => ({
  simpleAction: () => dispatch(simpleAction())
})

class App extends Component {

  simpleAction = (event) => {
    this.props.simpleAction();
  }

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <h1>Example heading</h1>
        </header>
        <button onClick={this.simpleAction}>Test redux action</button>
        <pre>
          {
            JSON.stringify(this.props)
          }
        </pre>
      </div>
    );
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(App);
