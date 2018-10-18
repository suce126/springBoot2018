const { createElement } = React
const { render } = ReactDOM

const style = {
    backgroundColor: 'orange',
    color: 'white',
    fontFamily: 'verdana'
}

const title = createElement(
    'h1',
    {id: 'title', className: 'header', style: style},
    'Hello World'
)

//const courseJson = [url:http://localhost:8080/topics]

render(
    title,
    document.getElementById('root')
)