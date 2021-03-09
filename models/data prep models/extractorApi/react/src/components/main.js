import React from "react";

function Main(props) {
  const links = (Object.values(props.result));
  console.log(links)
  return (
    <div className="cont">
      {links.map((link, i) => (
        <img src={link} key={i} alt="error" />
      ))}
    </div>
  );
}

export default Main;
